package study.datajpa.repository;

import lombok.Value;

public interface UsernameOnly {

    @Value("#{target.username+' '+targer.age}")
    String getUsername();
}
