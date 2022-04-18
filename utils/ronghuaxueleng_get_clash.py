import os
import time
import shutil
from yamlUtils import YamlUtils
from ronghuaxueleng_cfmem import get_content as cfmem_content

changfengoss = os.path.join("changfengoss")
dirname = time.strftime("%Y_%m_%d", time.localtime(time.time()))
yamlUtils = YamlUtils(changfengoss)
yamlUtils.clone_repo("https://github.com/changfengoss/pub.git")
yamlUtils.make_template_dict("yaml", dirname)
yamlUtils.save_file("sub/changfengoss.yaml")
shutil.rmtree(changfengoss)

cfmem_content()

pub = os.path.join("pub")
yamlUtils = YamlUtils(pub)
yamlUtils.make_template(["cfmem.yaml"])
yamlUtils.save_file("sub/combine.yaml")
