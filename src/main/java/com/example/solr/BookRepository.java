package com.example.solr;

import com.example.solr.domain.Book;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface BookRepository extends SolrCrudRepository <Book, String > {

}