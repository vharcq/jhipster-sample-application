package com.contraste.vha.jhipster.repository.search;
import com.contraste.vha.jhipster.domain.Task;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Task} entity.
 */
public interface TaskSearchRepository extends ElasticsearchRepository<Task, Long> {
}
