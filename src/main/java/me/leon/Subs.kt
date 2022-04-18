package me.leon

import me.leon.support.b64Encode
import me.leon.support.b64EncodeNoEqual
import me.leon.support.toJson
import me.leon.support.urlEncode

interface Uri {
    fun toUri(): String
    fun info(): String
    var name: String
    var nation: String
    val SERVER: String
    val serverPort: Int
}

sealed class Sub : Uri

object NoSub : Sub() {
    override fun toUri() = "nosub"
    override fun info() = "nosub"
    override var name: String
        get() = "nosub"
        set(value) {}
    override var nation: String
        get() = "N/A"
        set(value) {}
    override var serverPort = 0
    override val SERVER = "nosub"
}

data class V2ray(
    /** address 服务器 */
    var add: String = "",
    var port: String = "",
    /** uuid */
    var id: String = "",
    /** alertId */
    var aid: String = "0",
    var scy: String = "auto",
    /** network */
    var net: String = "tcp",

    /** 伪装域名 */
    var host: String = "",
    /** 伪装路径 */
    var path: String = "",

    /** 默认false,空串即可 */
    var tls: String = "",
    var sni: String = "",
) : Sub() {
    var v: String = "2"
    var ps: String = ""

    /** 伪装类型 tcp/kcp/QUIC 默认none */
    var type: String = "none"
    override fun toUri() = "vmess://${this.toJson().b64Encode()}"
    override fun info() = "$nation $name vmess $add:$port"
    override var name: String
        get() = ps.ifEmpty { "$SERVER:$serverPort-V2-${hashCode()}" }
        set(value) {
            ps = value
        }
    override var serverPort: Int = 0
        get() = port.toInt()
    override val SERVER
        get() = add
    override var nation: String = ""
}

data class SS(
    val method: String = "",
    val pwd: String = "",
    val server: String = "",
    val port: String = "",
) : Sub() {
    var remark: String = ""
    override var nation: String = ""
    override fun toUri() = "ss://${"$method:${pwd}@$server:$port".b64Encode()}#${name.urlEncode()}"

    override fun info() = "$nation $remark ss $server:$port"
    override var name: String
        get() = remark.ifEmpty { "$SERVER:$serverPort-SS-${hashCode()}" }
        set(value) {
            remark = value
        }
    override val serverPort
        get() = port.toInt()
    override val SERVER
        get() = server
}

data class SSR(
    val server: String = "",
    val port: String = "",
    val protocol: String = "",
    val method: String = "",
    val obfs: String = "",
    val password: String = "",
    val obfs_param: String = "",
    val protocol_param: String = "",
) : Sub() {
    var remarks: String = ""
    var group: String = ""
    override fun toUri() =
        "ssr://${
            ("$server:$port:$protocol:$method:$obfs:${password.b64Encode()}" +
                    "/?obfsparam=${obfs_param.b64EncodeNoEqual()}" +
                    "&protoparam=${protocol_param.b64EncodeNoEqual()}" +
                    "&remarks=${name.b64EncodeNoEqual()}" +
                    "&group=${group.b64EncodeNoEqual()}")
                .b64Encode()
        }"

    override fun info() = "$nation $remarks ssr $server:$port"
    override var name: String
        get() = remarks.ifEmpty { "$SERVER:$serverPort-SSR-${hashCode()}" }
        set(value) {
            remarks = value
        }
    override val serverPort
        get() = port.toInt()
    override val SERVER
        get() = server
    override var nation: String = ""
}

data class Trojan(val password: String = "", val server: String = "", val port: String = "") :
    Sub() {
    var remark: String = ""
    var query: String = ""
    override fun toUri() = "trojan://${"${password}@$server:$port$params"}#${name.urlEncode()}"
    override fun info() =
        if (query.isEmpty()) "$nation $name trojan $server:$port"
        else "$nation $remark trojan $server:$port?$query"

    override var name: String
        get() = remark.ifEmpty { "$SERVER:$serverPort-TR-${hashCode()}" }
        set(value) {
            remark = value
        }
    private val params
        get() = if (query.isEmpty()) "" else "?$query"
    override val serverPort
        get() = port.toInt()
    override val SERVER
        get() = server
    override var nation: String = ""
}

fun Sub.methodUnSupported() =
    this is SSR && method in SSR_unSupportCipher ||
        this is SS && method in SS_unSupportCipher ||
        this is V2ray && net in VMESS_unSupportProtocol

val SSR_unSupportCipher = arrayOf("none", "rc4", "rc4-md5")
val SS_unSupportCipher = arrayOf("rc4-md5")
val VMESS_unSupportProtocol = arrayOf("none")
