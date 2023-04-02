package com.mayank.servers.repo;

import com.mayank.servers.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepo extends MongoRepository<Server,Long> {
  Server findByIpAddress(String ipAddress);
}
