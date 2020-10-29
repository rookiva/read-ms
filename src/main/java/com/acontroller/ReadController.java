package com.acontroller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Base64;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.User;

@RestController
@PropertySource("classpath:messages.properties") /* place the properties file under src/main/resources */
public class ReadController {

	@Autowired
	private Environment env;

	@Autowired
	private com.bservice.IreadService readService;
	
	//@CrossOrigin
	@GetMapping("/read")
	public List<User> read() {
		
		//String uploadRoot = System.getProperty("catalina.base");
		String uploadRoot = "C:" + File.separator + "_local_git_repository";
		String fileLocation = uploadRoot + File.separator + env.getProperty("img_path") + File.separator + env.getProperty("img_folder") + File.separator;

		List<User> userList = readService.findAllUser();
		
		String base64Encoded = null;
		
		for (User user : userList) {

			String fileName = fileLocation + user.getUserId() + ".jpg";
			
			try {

				BufferedImage image = ImageIO.read(new File(fileName));
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ImageIO.write(image, "jpg", baos);
				byte[] res = baos.toByteArray();
				byte[] encodeBase64 = Base64.getEncoder().encode(res);
				base64Encoded = new String(encodeBase64, "UTF-8");

			} catch (Exception e) {

			}
			user.setBase64EncodedImg(base64Encoded);

		}		
		
		return userList;

	}
}