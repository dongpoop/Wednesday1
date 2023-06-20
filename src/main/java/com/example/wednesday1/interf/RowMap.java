package com.example.wednesday1.interf;

import java.sql.ResultSet;

public interface RowMap<T> {
    T rowMapping (ResultSet rs);
}
