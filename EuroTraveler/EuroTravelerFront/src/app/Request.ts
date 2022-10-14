export interface Request{
    budget : number,
    travelingHours : number,
    transportType:string,
    ageCategory:number[],
    dateFrom: Date,
    dateTo: Date,
    interests:string[]
}