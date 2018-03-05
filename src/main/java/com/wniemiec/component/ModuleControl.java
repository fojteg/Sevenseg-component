package com.wniemiec.component;

import com.wniemiec.component.type.SegmentPositionType;

import java.util.List;
import java.util.function.Function;

public interface ModuleControl<T> {

    List<SegmentPositionType> getSegments(T t);
}
