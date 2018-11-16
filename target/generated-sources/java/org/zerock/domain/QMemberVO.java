package org.zerock.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberVO is a Querydsl query type for MemberVO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberVO extends EntityPathBase<MemberVO> {

    private static final long serialVersionUID = 447942217L;

    public static final QMemberVO memberVO = new QMemberVO("memberVO");

    public final StringPath email = createString("email");

    public final StringPath mid = createString("mid");

    public final StringPath mname = createString("mname");

    public final StringPath mpw = createString("mpw");

    public final DateTimePath<java.sql.Timestamp> regdate = createDateTime("regdate", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> updatedate = createDateTime("updatedate", java.sql.Timestamp.class);

    public QMemberVO(String variable) {
        super(MemberVO.class, forVariable(variable));
    }

    public QMemberVO(Path<? extends MemberVO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberVO(PathMetadata metadata) {
        super(MemberVO.class, metadata);
    }

}

