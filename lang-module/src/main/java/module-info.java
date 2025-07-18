module lang.module {
    exports com.peterabyte.hello.lang.java9.module;
    provides com.peterabyte.hello.lang.java9.module.HelloModulesService with com.peterabyte.hello.lang.java9.module.HelloModulesServiceImpl;
}
