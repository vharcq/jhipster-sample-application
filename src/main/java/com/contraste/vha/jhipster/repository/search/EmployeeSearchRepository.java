package com.contraste.vha.jhipster.repository.search;
import com.contraste.vha.jhipster.domain.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Employee} entity.
 */
public interface EmployeeSearchRepository extends ElasticsearchRepository<Employee, Long> {
}
