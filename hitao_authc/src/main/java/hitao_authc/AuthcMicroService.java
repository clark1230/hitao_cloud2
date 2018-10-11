package hitao_authc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 授权微服务
 * @author xyj
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthcMicroService {
	public static void main(String[] args) {
		SpringApplication.run(AuthcMicroService.class, args);
	}
}
