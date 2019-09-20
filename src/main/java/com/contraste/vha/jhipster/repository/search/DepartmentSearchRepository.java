package com.contraste.vha.jhipster.repository.search;
import com.contraste.vha.jhipster.domain.Department;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Department} entity.
 */
public interface DepartmentSearchRepository extends ElasticsearchRepository<Department, Long> {
}
