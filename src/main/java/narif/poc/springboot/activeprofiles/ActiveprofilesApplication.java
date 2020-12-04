package narif.poc.springboot.activeprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActiveprofilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveprofilesApplication.class, args);
	}

	@Value("${custom.msg}")
	private String msg;

	@GetMapping
	public String getMsg(){
		return msg;
	}

}
