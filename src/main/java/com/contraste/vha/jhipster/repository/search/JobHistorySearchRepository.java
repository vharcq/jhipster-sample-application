package com.contraste.vha.jhipster.repository.search;
import com.contraste.vha.jhipster.domain.JobHistory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link JobHistory} entity.
 */
public interface JobHistorySearchRepository extends ElasticsearchRepository<JobHistory, Long> {
}
