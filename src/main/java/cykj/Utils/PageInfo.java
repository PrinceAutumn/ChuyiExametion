package cykj.Utils;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version 1.0
 * @author: Malin
 * @date: 2021/6/14 16:16
 * @desc:通用分页
 */

public class PageInfo {

    private Integer pageNo;
    private int pageSize;
    private Long totalCount;

    public PageInfo(Integer pageNo,Long totalCount,int pageSize) {
        this.pageNo = pageNo;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
    }


    //总页数
    public long getTotalPage() {
        Long totalPage = totalCount/pageSize;
        if(totalCount%pageSize!=0 || totalPage == 0) {
            totalPage++;
        }
        return totalPage;
    }

    //下一页
    public int getNextPage() {
        Integer nextPage = 0;
        if(nextPage<this.getTotalPage()) {
            nextPage = pageNo+1;
        }else {
            nextPage = pageNo;
        }
        return nextPage;
    }
    //上一页
    public int getPrePage() {
        Integer prePage = 0;
        if(pageNo>1) {
            prePage = pageNo-1;
        }else {
            prePage = pageNo;
        }
        return prePage;
    }
    //是否首页
    public boolean isFirstPage() {
        boolean isFirstPage = false;
        if(pageNo>1) {
            isFirstPage = false;
        }else {
            isFirstPage = true;
        }
        return isFirstPage;
    }
    //是否尾页
    public boolean isLastPage() {
        boolean isLastPage = false;
        if(pageNo<this.getTotalPage()) {
            isLastPage = false;
        }else {
            isLastPage = true;
        }
        return isLastPage;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }




}
