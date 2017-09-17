package org.publiccms.entities.cms;

import com.publiccms.common.generator.annotation.GeneratorColumn;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static org.publiccms.common.database.CmsUpgrader.IDENTIFIER_GENERATOR;

/**
 * CmsContentFiles generated by hbm2java
 * 文章附件
 */
@Entity
@Table(name = "cms_content_file")
public class CmsContentFile implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "内容", condition = true)
    private long contentId;
    @GeneratorColumn(title = "上传用户", condition = true)
    private long userId;
    @GeneratorColumn(title = "文件路径")
    private String filePath;
    @GeneratorColumn(title = "是否图片", condition = true)
    private boolean image;
    @GeneratorColumn(title = "大小", order = true)
    private int size;
    @GeneratorColumn(title = "点击", order = true)
    private int clicks;
    @GeneratorColumn(title = "排序")
    private int sort;
    @GeneratorColumn(title = "描述")
    private String description;

    public CmsContentFile() {
    }

    public CmsContentFile(long contentId, long userId, String filePath, boolean image, int size, int clicks, int sort) {
        this.contentId = contentId;
        this.userId = userId;
        this.filePath = filePath;
        this.image = image;
        this.size = size;
        this.clicks = clicks;
        this.sort = sort;
    }

    public CmsContentFile(long contentId, long userId, String filePath, boolean image, int size, int clicks, int sort,
            String description) {
        this.contentId = contentId;
        this.userId = userId;
        this.filePath = filePath;
        this.image = image;
        this.size = size;
        this.clicks = clicks;
        this.sort = sort;
        this.description = description;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = IDENTIFIER_GENERATOR)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "content_id", nullable = false)
    public long getContentId() {
        return this.contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "file_path", nullable = false)
    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Column(name = "image", nullable = false)
    public boolean isImage() {
        return this.image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }

    @Column(name = "size", nullable = false)
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Column(name = "clicks", nullable = false)
    public int getClicks() {
        return this.clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    @Column(name = "sort", nullable = false)
    public int getSort() {
        return this.sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Column(name = "description", length = 300)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
