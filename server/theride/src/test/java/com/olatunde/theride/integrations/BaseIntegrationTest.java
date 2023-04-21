package com.olatunde.theride.integrations;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@ExtendWith(SpringExtension.class)
@Slf4j
@ActiveProfiles("test")
@ComponentScan(basePackages = {"com.olatunde.theride"})
public class BaseIntegrationTest {

}