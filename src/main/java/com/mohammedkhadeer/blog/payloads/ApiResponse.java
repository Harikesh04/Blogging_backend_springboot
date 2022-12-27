package com.mohammedkhadeer.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
	//here what ever this we are returning in response we have added here
	//if you want to return more paramter like time ,anything then just add that here and pass that in response.

	private String message;
	private boolean success;
}
