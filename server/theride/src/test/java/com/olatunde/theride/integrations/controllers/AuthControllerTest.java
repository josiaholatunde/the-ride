package com.olatunde.theride.integrations.controllers;

import com.olatunde.theride.advice.GlobalControllerAdvice;
import com.olatunde.theride.advice.WrapResponseAdvice;
import com.olatunde.theride.controllers.AuthController;
import com.olatunde.theride.integrations.BaseIntegrationTest;
import com.olatunde.theride.services.AccountRegistrationService;
import com.olatunde.theride.util.RequestValidatorUtil;
import com.olatunde.theride.util.ResponseUtilService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthControllerTest extends BaseIntegrationTest {

    @InjectMocks
    private AuthController authenticationController;

    @Mock
    private AccountRegistrationService accountRegistrationService;
    @Autowired
    private RequestValidatorUtil requestValidatorUtil;
    @Autowired
    private ResponseUtilService responseUtilService;
    private MockMvc mockMvc;
    @BeforeEach
    protected void setup() {
        MockitoAnnotations.initMocks(this);
        authenticationController = new AuthController(accountRegistrationService,requestValidatorUtil);

        mockMvc = MockMvcBuilders.standaloneSetup(authenticationController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setControllerAdvice(new WrapResponseAdvice(responseUtilService), new GlobalControllerAdvice(responseUtilService))
                .build();
    }

    @Test
    public void testEquals() {
        assertEquals(2, 2);
    }
}
