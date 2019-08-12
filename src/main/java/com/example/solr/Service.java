package com.example.solr;

import com.example.solr.domain.Book;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.*;
import org.springframework.data.solr.core.query.result.FacetFieldEntry;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.data.solr.core.query.result.FieldStatsResult;
import org.springframework.data.solr.core.query.result.StatsPage;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Arrays;
import java.util.Collection;

@org.springframework.stereotype.Service
public class Service {

    @Autowired BookRepository bookRepository;

    @Autowired
    SolrTemplate solrTemplate;

    @Scheduled(fixedRate = 100000, initialDelay = 0)
    public void test(){
        /*bookRepository.findAll().forEach(obj -> System.out.println(obj));

        System.out.println("-----------------------------------");

        FacetQuery query = new SimpleFacetQuery(new Criteria(Criteria.WILDCARD).expression(Criteria.WILDCARD))
                .setFacetOptions(new FacetOptions().addFacetOnPivot("author", "genre"));

        FacetPage<Book> page = solrTemplate.queryForFacetPage("books2", query, Book.class);
        Collection<Page<FacetFieldEntry>> facetResultPages = page.getFacetResultPages();
        facetResultPages.iterator().next().get().forEach(obj -> System.out.println(obj.getValue() + " # " + obj.getValueCount()));
        System.out.println(1);*/

        /*FacetOptions.FieldWithNumericRangeParameters facetParameters = new FacetOptions.FieldWithNumericRangeParameters("price", 0, 50, 5);

        FacetQuery query = new SimpleFacetQuery(new Criteria(Criteria.WILDCARD).expression(Criteria.WILDCARD))
                .setFacetOptions(new FacetOptions()
                        .addFacetByRange(facetParameters)
                        //.addFacetOnPivot("author", "genre")
                        );

        FacetPage<Book> page = solrTemplate.queryForFacetPage("books2", query, Book.class);
        Collection<Page<FacetFieldEntry>> facetResultPages = page.getFacetResultPages();
        facetResultPages.iterator().next().get().forEach(obj -> System.out.println(obj.getValue() + " # " + obj.getValueCount()));
        */

       /* // simple field stats
        StatsOptions statsOptions = new StatsOptions()
                .addField("price")
                .addFacet("sequence");

// query
        SimpleQuery statsQuery = new SimpleQuery("*:*");
        statsQuery.setStatsOptions(statsOptions);
        StatsPage<Book> statsPage = solrTemplate.queryForStatsPage("books2", statsQuery, Book.class);

// retrieving stats info
        FieldStatsResult priceStatResult = statsPage.getFieldStatsResult("price");
        Object sum = priceStatResult.getSum();
        Long missing = priceStatResult.getMissing();*/

        /*System.out.println("-----------------------------------");

        FacetQuery query = new SimpleFacetQuery(new Criteria(Criteria.WILDCARD).expression(Criteria.WILDCARD))
                .setFacetOptions(new FacetOptions().addFacetOnPivot("author", "genre"));

        FacetPage<Book> page = solrTemplate.queryForFacetPage("books2", query, Book.class);
        Collection<Page<FacetFieldEntry>> facetResultPages = page.getFacetResultPages();
        System.out.println(1);
         */
    }
}
