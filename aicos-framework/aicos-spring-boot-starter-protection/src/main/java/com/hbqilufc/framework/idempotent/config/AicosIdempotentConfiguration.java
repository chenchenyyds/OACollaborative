package com.hbqilufc.framework.idempotent.config;

import com.hbqilufc.framework.idempotent.core.aop.IdempotentAspect;
import com.hbqilufc.framework.idempotent.core.keyresolver.impl.DefaultIdempotentKeyResolver;
import com.hbqilufc.framework.idempotent.core.keyresolver.impl.ExpressionIdempotentKeyResolver;
import com.hbqilufc.framework.idempotent.core.keyresolver.IdempotentKeyResolver;
import com.hbqilufc.framework.idempotent.core.keyresolver.impl.UserIdempotentKeyResolver;
import com.hbqilufc.framework.idempotent.core.redis.IdempotentRedisDAO;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import com.hbqilufc.framework.redis.config.AicosRedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;

@AutoConfiguration(after = AicosRedisAutoConfiguration.class)
public class AicosIdempotentConfiguration {

    @Bean
    public IdempotentAspect idempotentAspect(List<IdempotentKeyResolver> keyResolvers, IdempotentRedisDAO idempotentRedisDAO) {
        return new IdempotentAspect(keyResolvers, idempotentRedisDAO);
    }

    @Bean
    public IdempotentRedisDAO idempotentRedisDAO(StringRedisTemplate stringRedisTemplate) {
        return new IdempotentRedisDAO(stringRedisTemplate);
    }

    // ========== 各种 IdempotentKeyResolver Bean ==========

    @Bean
    public DefaultIdempotentKeyResolver defaultIdempotentKeyResolver() {
        return new DefaultIdempotentKeyResolver();
    }

    @Bean
    public UserIdempotentKeyResolver userIdempotentKeyResolver() {
        return new UserIdempotentKeyResolver();
    }

    @Bean
    public ExpressionIdempotentKeyResolver expressionIdempotentKeyResolver() {
        return new ExpressionIdempotentKeyResolver();
    }

}
