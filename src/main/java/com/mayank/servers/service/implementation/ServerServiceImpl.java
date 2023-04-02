package com.mayank.servers.service.implementation;

import com.mayank.servers.model.Server;
import com.mayank.servers.service.ServerService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ServerServiceImpl implements ServerService {
  @Override
  public Server create(Server server) {
    log.info("saving a new server: {}", server.getName());
    return null;
  }

  @Override
  public Server ping(String ipAddress) {
    return null;
  }

  @Override
  public Collection<Server> list(int limit) {
    return null;
  }

  @Override
  public Server get(Long id) {
    return null;
  }

  @Override
  public Server update(Server server) {
    return null;
  }

  @Override
  public Boolean delete(Long id) {
    return null;
  }
}
