package com.serenitydojo;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class whenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether(){
        int initialYear = 1985;
        int targetYear = 0;
        int timeJump = 30;
        targetYear = initialYear + timeJump;

        assertThat(targetYear, equalTo(2015));
    }
}
