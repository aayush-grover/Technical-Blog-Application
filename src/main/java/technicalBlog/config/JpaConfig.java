package technicalBlog.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class JpaConfig {

    @Bean
    public EntityManagerFactory entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emfb  = new LocalContainerEntityManagerFactoryBean();
        emfb.setPersistenceXmlLocation("classpath:META-INF/persistence.xml");
        emfb.afterPropertiesSet();

        return emfb.getObject();
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/technicalblog");
        ds.setUsername("postgres");
        ds.setPassword("root");
        return ds;
    }
}


