package com.cp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cp.writer.IWriter;

@Component
public class MySpringBeanWithDependency {
	
	@Autowired
	private IWriter niceWriter;

    public void setWriter(IWriter writer) {
        this.niceWriter = writer;
    }

    public void run() {
        String s = "Write something ....";
        niceWriter.writer(s);
    }

}
