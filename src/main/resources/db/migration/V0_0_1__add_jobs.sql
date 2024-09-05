create table jobs (
    id serial primary key,
    hash varchar(255) not null,
    predecessor_id int,
    status varchar(255) not null,
    constraint fk_predecessor foreign key(predecessor_id) references jobs(id)
);

create unique index jobs_hash_idx on jobs (hash);