package com.harvind.WebHook_Delivery_Platform.dto;

import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;
import org.springframework.stereotype.Component;


public record CreateEndpointRequest (

    @NotBlank(message = "url cannot be empty")
    @Size(max = 500)
    @URL(message = "")
    String url,


    String name

){}