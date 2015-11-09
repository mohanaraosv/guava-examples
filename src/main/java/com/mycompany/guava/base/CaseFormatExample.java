package com.mycompany.guava.base;

import com.google.common.base.CaseFormat;

/**
 * @author mohanarao_sv
 *
 */
public class CaseFormatExample {

    public static void main(final String[] args) {

        String str = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, "studentName");
        System.out.println(str); // STUDENT_NAME

        str = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "STUDENT_NAME");
        System.out.println(str);  // studentName

        str = CaseFormat.LOWER_HYPHEN.to(CaseFormat.UPPER_CAMEL, "student-name");
        System.out.println(str);  // StudentName

        str = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, "StudentName");
        System.out.println(str);  // student-name
    }
}
