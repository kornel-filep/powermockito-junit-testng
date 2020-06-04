package com.asd;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.Test;

@PrepareForTest({Mom.class})
class MomTest extends PowerMockTestCase {

    Mom mom = new Mom();

    @Test
    void testAuch() throws Exception {
        Child mockChild = PowerMockito.mock(Child.class);
        PowerMockito.whenNew(Child.class).withAnyArguments().thenReturn(mockChild);
        PowerMockito.doAnswer(c -> {
            System.out.println("AAAAAAAA");
            return "";
        }).when(mockChild).kick();
        mom.auch();
    }

}