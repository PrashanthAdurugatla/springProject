package io.learnSpring;

import org.springframework.stereotype.Component;

@Component
public class ChemTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Hi I'm Your Chemistry Teacher");
    }
}
