package com.msj.blog.entity.domain.article;

import com.msj.blog.entity.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "article_category",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class ArticleCategory extends BaseEntity {

    private static final long serialVersionUID = -9123364858524160112L;
    private Integer sort;//分类排序
    @Column(name = "name", length = 16, nullable = false)
    private String name;
    @Column(name = "alias", length = 16, nullable = false)
    private String alias;

    @OneToMany(mappedBy = "articleCategory")
    private Set<Article> articles;

    @ManyToOne
    @JoinColumn(name = "module_id")
    private ArticleModule articleModule;

}