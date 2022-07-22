package com.eazybytes.eazyschool.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class Contact {

    @NotBlank(message = "Name must not bbe blank")
    @Size(min = 3, message = "Name must at least characters long")
    private String name;

    @NotBlank(message = "Mobile number not bbe blank")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNum;

    @NotBlank(message = "Email must not bbe blank")
    @Email(message = "Please provide a valid email address")
    private String email;

    @NotBlank(message = "Subject must not bbe blank")
    @Size(min = 5, message = "Subject must be at least 5 characters long")
    private String subject;

    @NotBlank(message = "Message must not bbe blank")
    @Size(min = 5, message = "Message must be at least 10 characters long")
    private String message;


}
