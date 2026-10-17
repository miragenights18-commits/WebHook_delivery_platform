package com.harvind.WebHook_Delivery_Platform.repo;


import com.harvind.WebHook_Delivery_Platform.entity.Endpoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface EndpointRepository extends JpaRepository<Endpoint, UUID> {

    Optional<Endpoint> findById(Long id);

}
