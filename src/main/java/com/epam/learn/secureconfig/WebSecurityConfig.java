//package com.epam.learn.secureconfig;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//
////    private final AuthManager authenticationManager;
////    private final SecurityContextRepository securityContextRepository;
//
////    public WebSecurityConfig(AuthManager authenticationManager, SecurityContextRepository securityContextRepository) {
////        this.authenticationManager = authenticationManager;
////        this.securityContextRepository = securityContextRepository;
////    }
//
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.formLogin((form) -> form
//                        .loginPage("/login")
//                        .permitAll())
//                .logout((logout) -> logout.permitAll())
//                .authorizeRequests()
//                .antMatchers("/", "/home", "/favicon.ico").permitAll();
//        return http.build();
//    }
//
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
////
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
////         return httpSecurity
////                .exceptionHandling()
////                .authenticationEntryPoint((httpServletRequest, httpServletResponse, e) -> {
////                })
////                .accessDeniedHandler((request, response, accessDeniedException) -> {
////                })
////                .and()
////                .csrf().disable()
////                .formLogin().disable()
////                .httpBasic().disable()
////                .authenticationProvider(authenticationManager)
////                .securityContext().securityContextRepository(securityContextRepository)
////                .and()
////                .authorizeRequests()
////                .antMatchers("/", "/login", "/favicon.ico").permitAll()
////                .antMatchers("/controller").hasRole("ADMIN")
////                .anyRequest()
////                .authenticated()
////                .and()
////                .build();
////
////    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("user")
//                        .password("password")
//                        .roles("USER")
//                        .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
//}
