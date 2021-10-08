package lab3;

import java.util.ArrayList;
import java.util.List;

public class QLStudent<E> extends Student implements StudentInterface {

    private List<Student> lst;

    public QLStudent() {
        lst = new ArrayList<>();
    }

    @Override
    public List<Student> sortList(String chon) {
        List<Student> list = getList();
        if (chon.equalsIgnoreCase("name")) {
            lst.sort((a, b) -> {
                return a.getName().compareTo(b.getName());
            });
        } else {
            lst.sort((a, b) -> {
                Double o1 = a.getMarks();
                Double o2 = b.getMarks();
                return o1.compareTo(o2);
            });
        }
        return list;
    }

    @Override
    public void insert(Object e) {
        lst.add((Student) e);
    }

    @Override
    public void delete(int viTri) {
        lst.remove(viTri);
    }

    @Override
    public void update(int viTri, Student s) {
        lst.set(viTri, s);
    }

    @Override
    public List<Student> getList() {
        return lst;
    }

    @Override
    public void setList(List list) {
        this.lst = list;
    }
    //https://phamlinh02.github.io/jekyll/update/2021/07/27/gitAndGithub.htmlgot
    //https://anhquan02.github.io/jekyll/update/2021/07/29/my-blog.html
    //https://jekyllrb.com/
    //https://hai-nguyen-21.github.io/
    //MDI Form
    //JInternalFrame
    //https://freetuts.net/git-ba-trang-thai-committed-staged-modified-1079.html
}
