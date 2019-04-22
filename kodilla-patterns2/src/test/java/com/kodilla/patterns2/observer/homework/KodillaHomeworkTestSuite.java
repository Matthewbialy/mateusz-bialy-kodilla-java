package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.observer.homework.KodillaCourses;
import com.kodilla.patterns2.observer.forum.observer.homework.Mentor;
import com.kodilla.patterns2.observer.forum.observer.homework.Student;
import org.junit.Assert;
import org.junit.Test;

public class KodillaHomeworkTestSuite {

    @Test
    public void testHomeworks() {

        //Given
        Student matthewBialy = new Student("Matthew Bialy", KodillaCourses.Java_Developer);
        Student alexBialy = new Student("Alex Bialy", KodillaCourses.Web_Developer);

        Mentor ediMohra = new Mentor("Eddie Mohra");
        Mentor willRuth = new Mentor("Will Ruth");

        matthewBialy.registerObserver(ediMohra);
        alexBialy.registerObserver(willRuth);

        //When
        matthewBialy.addHomework("2.2", "ArrayList");
        alexBialy.addHomework("14.1", "JavaScript");

        //Then
        Assert.assertEquals(1, ediMohra.getUpdateCount());
        Assert.assertEquals(1,willRuth.getUpdateCount());

    }
}
