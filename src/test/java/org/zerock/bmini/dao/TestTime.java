package org.zerock.bmini.dao;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

@Log4j2
public class TestTime {

    @Test
    public void getTime() {
        String time = TimeDAO.INSTANCE.selectTime();

        log.info(time);
    }
}
