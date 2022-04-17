package com.example.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

/* In previous examples we used bean.xml file to config our dependencies like creating object,injecting values
using setter methods and autowire annotations.By using component annotation can create object with
help of bean(<context:annotation-config></context:annotation-config>
<context:component-scan base-package="com.example.withoutXmlfile"></context:component-scan>)like this.
but i want create in jave file.here we going to create object without using xml file.
 */
//@Component("collegebean")
public class College {
    @Value("SeliniumExpress")
    private String collegeName;
    //@Autowired =>we can use autowired annotation here to inject object instead of creating setter method and pass
    //from the config class.
    private Principle principle;
   // @Autowired
    private Teacher teacher;

    public College(Teacher teacher) {
       this.teacher = teacher;
    }

    public void setPrinciple(Principle principle)
   {
      this.principle = principle;
    }


    public void test(){
       System.out.println("test call methods");
        System.out.println("Your college name is");
        principle.principleInfo();
        teacher.teach();
       System.out.println(collegeName);
    }
}
