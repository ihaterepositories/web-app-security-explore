package web.security.laba1;

/*
    @author boguc
    @project laba1
    @class AccessTests
    @version 1.0.0
    @since 18.04.2025 - 20.36
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@ActiveProfiles("test")
public class AccessTests {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

//    @BeforeEach
//    void beforeAll(){
//        mockMvc = MockMvcBuilders
//                .webAppContextSetup(webApplicationContext)
//                .apply(springSecurity())
//                .build();
//    }
//
//    @Test
//    @WithAnonymousUser
//    public void whenEmptyCredsThenStatusUnauthorized() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons"))
//                .andExpect(status().isUnauthorized());
//    }
//
//    // admin route
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = {"ADMIN"})
//    public void whenAccessAdminRoute_withAdminRole_thenReturn200() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/admin"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    @WithMockUser(username = "user", password = "user", roles = {"USER"})
//    public void whenAccessAdminRoute_withUserRole_thenReturn403() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/admin"))
//                .andExpect(status().isForbidden());
//    }
//
//    @Test
//    public void whenAccessAdminRoute_withoutAuthentication_thenReturn401() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/admin"))
//                .andExpect(status().isUnauthorized());
//    }
//
//    // user route
//
//    @Test
//    @WithMockUser(username = "user", password = "user", roles = {"USER"})
//    public void whenUserRoute_withUserRole_thenReturn200() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/user"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = {"ADMIN"})
//    public void whenUserRoute_withAdminRole_thenReturn403() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/user"))
//                .andExpect(status().isForbidden());
//    }
//
//    @Test
//    public void whenAccessUserRoute_withoutAuthentication_thenReturn401() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/user"))
//                .andExpect(status().isUnauthorized());
//    }
//
//    // unknown route
//
//    @Test
//    @WithMockUser(username = "user", password = "user", roles = {"USER"})
//    public void whenAccessUnknownRoute_withUserRole_thenReturn200() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/unknown"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = {"ADMIN"})
//    public void whenAccessUnknownRoute_withAdminRole_thenReturn200() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/unknown"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    @WithMockUser(username = "unknown", password = "unknown", roles = {"UNKNOWN"})
//    public void whenAccessUnknownRoute_withUnknownRole_thenReturn200() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/unknown"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void whenAccessUnknownRoute_withoutAuthentication_thenReturn401() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/unknown"))
//                .andExpect(status().isUnauthorized());
//    }
//
//    // stranger route
//
//    @Test
//    @WithMockUser(username = "user", password = "user", roles = {"USER"})
//    public void whenAccessStrangerRoute_withUserRole_thenReturn200() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/stranger"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    @WithMockUser(username = "admin", password = "admin", roles = {"ADMIN"})
//    public void whenAccessStrangerRoute_withAdminRole_thenReturn200() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/persons/stranger"))
//                .andExpect(status().isOk());
//    }
}
