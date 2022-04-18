# **Code-Store**

[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/666greatchina888/code-store/Merge_Max?label=Merge_Max)](https://github.com/666greatChina888/Code-Store/actions/workflows/Merge_Max.yaml) 

![Watchers](https://img.shields.io/github/watchers/666greatChina888/Code-Store) ![Stars](https://img.shields.io/github/stars/666greatChina888/Code-Store) ![Forks](https://img.shields.io/github/forks/666greatChina888/Code-Store) ![Vistors](https://visitor-badge.laobi.icu/badge?page_id=666greatChina888.Code-Store)

[仓库介绍](https://github.com/666greatChina888/Code-Store#仓库介绍) | [使用方法](https://github.com/666greatChina888/Code-Store#使用方法) | [节点信息](https://github.com/666greatChina888/Code-Store#节点信息) | [软件推荐](https://github.com/666greatChina888/Code-Store#客户端选择) | [仓库声明](https://github.com/666greatChina888/Code-Store#仓库声明)

## 禁止fork！拒绝伸手党！请参考代码！

## 仓库介绍
对网络上各免费节点池及博主分享的节点进行测速筛选出较为稳定高速的节点，再导入到仓库中进行分享记录。所筛选的节点链接在仓库`./sub/sub_list.json`文件中，其中大部分为其他`GitHub`仓库链接，如果大家有好的订阅链接欢迎提交 PR ，这些链接包含的所有节点合并在仓库`./sub/sub_merge.txt`中。

测速筛选后的节点订阅文件在仓库根目录`Eterniy`(Base64)和`Eternity.yml`(Clash)。同时在仓库的`./update`中保留了原始节点链接的的记录。

虽然是测速筛选过后的节点，但仍然会出现部分节点不可用的情况，遇到这种情况建议选择`Clash`, `Shadowrocket`之类能自动切换低延迟节点的客户端。

## 使用方法
将以下订阅链接导入相应客户端即可。链接中大部分为 SS 协议节点，少量 Vmess, Trojan ,SSR 协议节点，建议选择协议支持完整的客户端。

- [多协议Base64编码](https://raw.githubusercontent.com/666greatChina888/Code-Store/master/Eternity)
- [Clash](https://raw.githubusercontent.com/666greatChina888/Code-Store/master/Eternity.yml)

另有国内加速链接：

- [多协议Base64编码](https://raw.fastgit.org/666greatChina888/Code-Store/master/Eternity)
- [Clash](https://raw.fastgit.org/666greatChina888/Code-Store/master/Eternity.yml)

>`Clash`链接所使用的配置在仓库`./update/provider/`中，有相应配置文件和以国家分类的`proxy-provider`。
>
>需要其它配置可使用订阅转换工具自行转换。
>自用在线订阅转换网址：
>
>1.[**sub-v1-mk**](https://sub.v1.mk/)
>
>2.[**Clash | Quantumult X | Surge 转换**](https://dove.589669.xyz/web)
>
>3.[**V2raySE**](https://v2rayse.com/)
>
>4.[**con8.tk**](https://www.con8.tk/)

##  [检测IP安全及可用性](https://ip.skk.moe/simple)
> 1.[Sukka/simple](https://ip.skk.moe/simple/)
> 
> 2.[Sukka/Debug](https://debug.skk.moe/)
>
> 3.[Whoer](https://whoer.net/)
>
> 4.[SpeedTest](https://www.speedtest.net/)

## 节点信息
- [source](https://github.com/666greatChina888/Code-Store/blob/master/sub/README.md)
- [sub](https://github.com/666greatChina888/Code-Store/tree/master/sub)

### 所有节点
合并节点总数: `452`
[节点链接](https://raw.githubusercontent.com/666greatChina888/Code-Store/master/sub/sub_merge.txt)

### 格式化节点
合并节点总数: `141`
[节点链接](https://raw.githubusercontent.com/666greatChina888/Code-Store/master/sub/sub_merge_yaml.yml)

### 节点来源
- [bpjzx](https://paste.in/), 节点数量: `13`
- [chfchf0306](https://github.com/chfchf0306/clash), 节点数量: `99`
- [Jsnzkpg/Jsnzkpg](https://github.com/Jsnzkpg/Jsnzkpg), 节点数量: `178`
- [Others](https://github.com), 节点数量: `162`

## 客户端选择
### 主流桌面客户端
|                            MacOS                             |                            Linux                             |                           Windows                            | 简易描述                                           |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :------------------------------------------------- |
| [CFW](https://github.com/Fndroid/clash_for_windows_pkg/releases) | [CFW](https://github.com/Fndroid/clash_for_windows_pkg/releases) | [CFW(Clash For Windows)](https://github.com/Fndroid/clash_for_windows_pkg/releases) | SS, SSR, Trojan, Vmess, VLESS协议支持，策略分流能力强。            |
|     [Qv2ray](https://github.com/Qv2ray/Qv2ray/releases)      |     [Qv2ray](https://github.com/Qv2ray/Qv2ray/releases)      |     [Qv2ray](https://github.com/Qv2ray/Qv2ray/releases)      | SS, SSR, Trojan, Vmess, VLESS, Trojan-Go协议支持（需安装相关插件）。 |
|                              ×                               |                              ×                               |      [V2rayN](https://github.com/2dust/v2rayN/releases)      | SS, Trojan, Vmess, VLESS协议支持，有测速，测延迟功能，支持订阅，二维码，剪贴板导入及手动配置。                 |
|                              ×                               |                              ×                               |    [WinXray](https://github.com/TheMRLL/winxray/releases)    | SS, SSR, Trojan, Vmess, VLESS协议支持，支持自动连接最快节点。            |
|                              ×                               |                              ×                               | [Shadowsocks-windows](https://github.com/shadowsocks/shadowsocks-windows/releases) | SS协议支持， SS 专用客户端。                                       |
|                              ×                               |                              ×                               | [ShadowsocksR-windows](https://github.com/HMBSbige/ShadowsocksR-Windows/releases) | SSR协议支持，SSR 专用客户端。                                      |
|                [Surge](https://nssurge.com/)                 |                              ×                               |                              ×                               | SS, Trojan, Vmess协议支持，著名网络调试工具，策略分流能力强大，需付费。                        |
|   [ClashX](https://github.com/yichengchen/clashX/releases)   |                              ×                               |                              ×                               | SS, SSR, Trojan, Vmess协议支持，占用资源较少。                   |
|      [V2rayU](https://github.com/yanue/V2rayU/releases)      |                              ×                               |                              ×                               | SS, Trojan, Vmess协议支持，支持订阅，二维码，剪贴板导入，手动配置，二维码分享，与 V2RayN 类似。                        |

### 主流移动客户端
|                          iOS/iPadOS                          |                           Android                            | 简易描述                                                     |
| :----------------------------------------------------------: | :----------------------------------------------------------: | ------------------------------------------------------------ |
| [Shadowrocket](https://apps.apple.com/us/app/shadowrocket/id932747118) | [Shadowrocket](https://play.google.com/store/apps/details?id=com.v2cross.proxy) | SS, SSR, Trojan, Vmess, VLESS协议支持，iOS端需在非国区 App Store 购买，美区售价 $2.99；安卓端非与 iOS 端同一作者，不支持 SSR 协议，免费且内置免费节点。 |
|                [Surge](https://nssurge.com/)                 |                              ×                               | SS, Trojan, Vmess协议支持，iOS 端著名网络调试工具，需付费。                                  |
| [Quantumult X](https://apps.apple.com/us/app/quantumult-x/id1443988620) |                              ×                               | SS, SSR, Trojan, Vmess协议支持，需在非国区AppStore购买，美区售价$4.99。 |
| [Potatso Lite](https://apps.apple.com/us/app/potatso-lite/id1239860606) |                              ×                               | SS, SSR协议支持，需在非国区AppStore购买，免费。              |
|                              ×                               | [Surfboard](https://play.google.com/store/apps/details?id=com.getsurfboard) | SS, SSR, Vmess协议支持，安卓端网络调试软件，兼容 Surge 2 配置。 |
|                              ×                               | [CFA(Clash For Android)](https://github.com/Kr328/ClashForAndroid/releases) | SS, SSR, Trojan, Vmess协议支持。                             |
|                              ×                               |  [SagerNet](https://github.com/SagerNet/SagerNet/releases)   | SS, SSR, Trojan, Vmess, VLESS协议支持。                      |
|                              ×                               | [Shadowsocks-android](https://github.com/shadowsocks/shadowsocks-android/releases) | SS协议支持，安卓专用 SS 客户端。                                                 |
|                              ×                               | [ShadowsocksR-android](https://github.com/HMBSbige/ShadowsocksR-Android/releases) | SSR协议支持，安卓专用 SSR 客户端。                                                |
|                              ×                               |     [V2rayNG](https://github.com/2dust/v2rayNG/releases)     | SS, Trojan, Vmess, VLESS协议支持，v2ray 内核。                           |


## 仓库声明
订阅节点仅作学习交流使用，只是对网络上节点的优选排序，用于查找资料，学习知识，不做任何违法行为。所有资源均来自互联网，仅供大家交流学习使用，出现违法问题概不负责。

## 星标统计
[![Stargazers over time](https://starchart.cc/666greatChina888/Code-Store.svg)](https://starchart.cc/666greatChina888/Code-Store)
