package org.miglecz;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Data access object for selecting/inserting/deleting/updating a specific database table
 */
@Component
public class SomethingDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    List<SomethingDto> getSomething() {
        return jdbcTemplate.query("SELECT 'Hello world!'", resultSet -> {
            final List<SomethingDto> result = new ArrayList<>();
            while (resultSet.next()) {
                result.add(new SomethingDto(resultSet.getString(1)));
            }
            return result;
        });
    }
}
