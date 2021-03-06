/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ksp.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/ksp/testData/api")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinKSPTestGenerated extends AbstractKotlinKSPTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInApi() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/ksp/testData/api"), Pattern.compile("^(.+)\\.kt$"), null, false);
    }

    @TestMetadata("allFunctions.kt")
    public void testAllFunctions() throws Exception {
        runTest("plugins/ksp/testData/api/allFunctions.kt");
    }

    @TestMetadata("annotationValue.kt")
    public void testAnnotationValue() throws Exception {
        runTest("plugins/ksp/testData/api/annotationValue.kt");
    }

    @TestMetadata("builtInTypes.kt")
    public void testBuiltInTypes() throws Exception {
        runTest("plugins/ksp/testData/api/builtInTypes.kt");
    }

    @TestMetadata("checkOverride.kt")
    public void testCheckOverride() throws Exception {
        runTest("plugins/ksp/testData/api/checkOverride.kt");
    }

    @TestMetadata("companion.kt")
    public void testCompanion() throws Exception {
        runTest("plugins/ksp/testData/api/companion.kt");
    }

    @TestMetadata("hello.kt")
    public void testHello() throws Exception {
        runTest("plugins/ksp/testData/api/hello.kt");
    }

    @TestMetadata("interfaceWithDefault.kt")
    public void testInterfaceWithDefault() throws Exception {
        runTest("plugins/ksp/testData/api/interfaceWithDefault.kt");
    }

    @TestMetadata("javaModifiers.kt")
    public void testJavaModifiers() throws Exception {
        runTest("plugins/ksp/testData/api/javaModifiers.kt");
    }

    @TestMetadata("javaTypes.kt")
    public void testJavaTypes() throws Exception {
        runTest("plugins/ksp/testData/api/javaTypes.kt");
    }

    @TestMetadata("javaTypes2.kt")
    public void testJavaTypes2() throws Exception {
        runTest("plugins/ksp/testData/api/javaTypes2.kt");
    }

    @TestMetadata("makeNullable.kt")
    public void testMakeNullable() throws Exception {
        runTest("plugins/ksp/testData/api/makeNullable.kt");
    }

    @TestMetadata("resolveJavaType.kt")
    public void testResolveJavaType() throws Exception {
        runTest("plugins/ksp/testData/api/resolveJavaType.kt");
    }

    @TestMetadata("typeComposure.kt")
    public void testTypeComposure() throws Exception {
        runTest("plugins/ksp/testData/api/typeComposure.kt");
    }

    @TestMetadata("varianceTypeCheck.kt")
    public void testVarianceTypeCheck() throws Exception {
        runTest("plugins/ksp/testData/api/varianceTypeCheck.kt");
    }

    @TestMetadata("visibilities.kt")
    public void testVisibilities() throws Exception {
        runTest("plugins/ksp/testData/api/visibilities.kt");
    }
}
