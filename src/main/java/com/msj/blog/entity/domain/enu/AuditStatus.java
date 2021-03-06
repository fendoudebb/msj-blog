package com.msj.blog.entity.domain.enu;

public enum AuditStatus {
    /**
     * type = 0 待审核
     * type = 1 审核拒绝
     * type = 2 上线
     * type = 3 下线
     */
    UNDER_REVIEW(0, "待审核"),
    REJECT(1, "审核拒绝"),
    ONLINE(2, "上线"),
    OFFLINE(3, "下线");

    private Integer type;

    private String description;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    AuditStatus(Integer type, String description) {
        this.type = type;
        this.description = description;
    }
}
