package com.zking.test.p3;

import com.google.auto.service.AutoService;
import com.zking.test.p2.TestAnnotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.HashSet;
import java.util.Set;

//@AutoService(Processor.class)
//public class IsNotNullProcessor extends AbstractProcessor {
public class IsNotNullProcessor {
    //@Override
    //public Set<String> getSupportedAnnotationTypes() {
    //    Set<String> types = new HashSet<String>();
    //    types.add(IsNotNull.class.getCanonicalName());
    //    return types;
    //}
    //
    //@Override
    //public SourceVersion getSupportedSourceVersion() {
    //    return SourceVersion.latestSupported();
    //}
    //
    //@Override
    //public synchronized void init(ProcessingEnvironment processingEnv) {
    //    super.init(processingEnv);
    //}
    //
    //@Override
    //public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    //    for (int i = 0; i < 10; i++) {
    //        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzz");
    //    }
    //    System.out.println("IsNotNullProcessor process execute, ts=" + System.currentTimeMillis());
    //    return false;
    //}
}
