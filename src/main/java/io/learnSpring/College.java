package io.learnSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("${college.Name}")
    private String collegeName;

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("chemTeacher")
    private Teacher teacher;

    public void test(){
        principal.principalInfo();
        teacher.teach();
        System.out.println("I'm from " + collegeName);
    }
}

