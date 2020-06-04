package com.asd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Mom.class})
public class MomTest {

    Mom mom = new Mom();

    @Test
    public void testAuch() throws Exception {
        Child mockChild = PowerMockito.mock(Child.class);
        PowerMockito.whenNew(Child.class).withAnyArguments().thenReturn(mockChild);
        PowerMockito.doAnswer(c -> {
            System.out.println("AAAAAAAA");
            return "";
        }).when(mockChild).kick();
        mom.auch();
    }

}