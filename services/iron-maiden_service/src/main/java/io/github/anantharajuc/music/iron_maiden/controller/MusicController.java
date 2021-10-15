package io.github.anantharajuc.music.iron_maiden.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Music Query Controller
 *
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 *
 */
@RestController
@RequestMapping("/music")
public class MusicController 
{
	@GetMapping
	public String list() 
	{
		return "{\"totalPages\":2,\"empty\":false,\"totalElements\":3,\"size\":2,\"content\":[{\"Song\":\"Wasted Years\",\"Album\":\"Somewhere in Time\"},{\"Song\":\"Hallowed Be Thy Name\",\"Album\":\"The Number of the Beast\"}]}";
	}
}