
package config;

import dao.DaoApi;
import dao.IDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoAliasConfig {

    @Bean(name = "dao")
    public IDao daoAlias(DaoApi target) {
        return target;
    }
}