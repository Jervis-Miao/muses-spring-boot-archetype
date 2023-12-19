package cn.muses.functional;

import cn.xyz.chaos.orm.generator.GeneratorLauncher;

/**
 * @author chaochenghan
 */
public class Generator {
    public static void main(String[] args) throws Exception {
        GeneratorLauncher.generate(getResourcesPath() + "/mybatis/generatorConfig.xml");
    }

    private static String getResourcesPath() {
        // noinspection ConstantConditions
        String classpath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        return classpath.substring(1, classpath.indexOf("/target")) + "/src/main/resources";
    }
}
