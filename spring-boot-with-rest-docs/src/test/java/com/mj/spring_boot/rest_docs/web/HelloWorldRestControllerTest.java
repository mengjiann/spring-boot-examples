package com.mj.spring_boot.rest_docs.web;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;

import static org.springframework.restdocs.request.RequestDocumentation.requestParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloWorldRestControllerTest {

    private MockMvc mockMvc;

    private HelloWorldRestController helloWorldRestController;

    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation();


    @Before
    public void setUp() throws Exception {

        helloWorldRestController = new HelloWorldRestController();

        mockMvc = MockMvcBuilders.standaloneSetup(helloWorldRestController)
                .apply(documentationConfiguration(this.restDocumentation)
                .operationPreprocessors().withResponseDefaults(prettyPrint())
                .and().uris().withScheme("https").withHost("hello-world").withPort(443))
                .build();

    }

    @Test
    public void hello() throws Exception {

        this.mockMvc.perform(RestDocumentationRequestBuilders.get("/hello?name=MJ"))
                .andExpect(status().isOk())
                .andDo(document("hello-world",requestParameters(
                        parameterWithName("name").description("Hello <name>. Default: World").optional()
                )));

    }
}