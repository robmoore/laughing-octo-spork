package demo;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
        extends CrudRepository<User, String>, QueryDslPredicateExecutor<User>, QuerydslBinderCustomizer<QUser> {}