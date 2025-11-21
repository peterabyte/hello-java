package com.peterabyte.hello.lang.java24;

import java.io.IOException;
import java.lang.classfile.ClassFile;
import java.lang.classfile.ClassFileBuilder;
import java.lang.classfile.ClassTransform;
import java.lang.classfile.CodeTransform;
import java.lang.classfile.MethodTransform;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassFileApiTest {
    @Test
    public void givenClassShouldTransform() throws IOException {
        var fooClassBytes = Files.readAllBytes(Path.of(Foo.class.getClassLoader().getResource("com/peterabyte/hello/lang/java24/Foo.class").getPath()));

        CodeTransform codeTransform = ClassFileBuilder::accept;
        MethodTransform methodTransform = MethodTransform.transformingCode(codeTransform);
        ClassTransform classTransform = ClassTransform.transformingMethods(methodTransform);
        ClassFile classFile = ClassFile.of();
        byte[] transformedClassBytes = classFile.transformClass(classFile.parse(fooClassBytes), classTransform);

        assertThat(transformedClassBytes).isNotNull();
    }
}
