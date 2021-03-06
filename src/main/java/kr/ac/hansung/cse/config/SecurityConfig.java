package kr.ac.hansung.cse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.anyRequest()
		.permitAll()//어떤 리퀘스트던 상관없이 다 허용하겠다.
		.and()
		.csrf().disable();//csrf기능은 사용하지않겠다.
		
		/*
		Security는
		1.Authentication
		2.Authorization
		이 2가지로 나눌수 있는데 Authorization만 설정하였다.
		 */
	}
}
